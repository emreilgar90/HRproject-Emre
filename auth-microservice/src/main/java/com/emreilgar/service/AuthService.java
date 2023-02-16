package com.emreilgar.service;

import com.emreilgar.dto.request.CreateProfileRequestDto;
import com.emreilgar.dto.request.DoLoginRequestDto;
import com.emreilgar.dto.request.RegisterRequestDto;
import com.emreilgar.dto.response.RegisterResponseDto;
import com.emreilgar.exception.AuthMicroserviceException;
import com.emreilgar.exception.ErrorType;
import com.emreilgar.manager.IUserProfileManager;
import com.emreilgar.mapper.IAuthMapper;
import com.emreilgar.repository.IAuthRepository;
import com.emreilgar.repository.entity.Auth;
import com.emreilgar.utility.JwtTokenManager;
import com.emreilgar.utility.ServiceManager;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.Optional;
@Service
public class AuthService extends ServiceManager<Auth,Long> {

    public final IAuthRepository repository;
    public final IUserProfileManager userProfileManager;
    private final JwtTokenManager jwtTokenManager;
    private final CreateUserProducer createUserProducer;



    public AuthService(IAuthRepository repository, IUserProfileManager userProfileManager, JwtTokenManager jwtTokenManager, CreateUserProducer createUserProducer) {
        super(repository);
        this.repository = repository;
        this.userProfileManager = userProfileManager;
        this.jwtTokenManager = jwtTokenManager;
        this.createUserProducer = createUserProducer;
    }
    public String dologin(DoLoginRequestDto dto) {
        Optional<Auth> auth =repository.findOptionalByEmailAndPassword(dto.getPassword(),dto.getEmail());
        if (auth.isEmpty())
            throw new ArithmeticException(ErrorType.LOGIN_ERROR.getMessage());
        Optional<String>token = jwtTokenManager.createToken(auth.get().getId());// yukarıda ki hatayı dönmediyse token oluşturur.
        if (auth.isEmpty())
            throw new AuthMicroserviceException(ErrorType.JWT_TOKEN_CREATE_ERROR);
        return token.get();
    }


    public RegisterResponseDto register(@Valid RegisterRequestDto dto) {
        if (!dto.getPassword().equals(dto.getRepassword()))
            throw new AuthMicroserviceException(ErrorType.REGISTER_REPASSWORD_ERROR);
        if (repository.findOptionalByUsername(dto.getUsername()).isPresent())
                      //findOptinalByUserName metodu IAuthRepository de ki metotlarda oluşturduk.
            throw new AuthMicroserviceException(ErrorType.REGISTER_KULLANICIADI_KAYITLI);

        Auth auth = save(IAuthMapper.INSTANCE.fromRegisterRequestDto(dto));  //mapper da yapmıştık !
        userProfileManager.createProfile(CreateProfileRequestDto.builder()
                .token("")
                .authid(auth.getId())
                .username(auth.getUsername())
                .email(auth.getEmail())
                .build());
        RegisterResponseDto result = IAuthMapper.INSTANCE.fromAuth(auth);
        result.setRegisterstate(100);
        result.setContent(auth.getEmail() + " ile başarı şekilde kayıt oldunuz.");
        return result;

    }
}
