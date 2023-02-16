package com.emreilgar.mapper;

import com.emreilgar.dto.request.RegisterRequestDto;
import com.emreilgar.dto.response.RegisterResponseDto;
import com.emreilgar.repository.entity.Auth;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE )

public interface IAuthMapper {

    IAuthMapper INSTANCE = Mappers.getMapper(IAuthMapper.class);  //bu classtan bir tane örnek oluştur.

    Auth fromRegisterRequestDto(final RegisterRequestDto dto);
    /**Bu metot, bir RegisterRequestDto nesnesini Auth nesnesine dönüştürmek için kullanılır.
     Yani RegisterRequestDto nesnesinin özellikleri Auth nesnesinin özelliklerine atanır ve bu
     şekilde Auth nesnesi oluşturulur. Genellikle, bu tür dönüştürme işlemleri, farklı katmanlarda
      (veri erişim katmanı, iş mantığı katmanı, sunum katmanı vb.) kullanılan nesnelerin birbirleriyle
       uyumlu hale getirilmesi için kullanılır. Bu sayede, bir katmandaki nesnelerin diğer katmanlara
       doğrudan aktarılması yerine, uygun dönüştürme işlemleri yapılarak nesnelerin uyumlu hale getirilmesi sağlanır.*/


    @Mappings({
            @Mapping(source = "id", target = "authid")
    })
    RegisterResponseDto fromAuth(final Auth auth);
    /**Bu metot, bir Auth nesnesini RegisterResponseDto nesnesine dönüştürmek için kullanılır.
     * Bu dönüşüm sırasında "id" özelliği "authid" özelliğine atanır.
     @Mappings anotasyonu, dönüşüm işleminde hangi özelliklerin nereye atanacağını belirtmek için kullanılır.
     Bu anotasyon içinde @Mapping anotasyonu kullanılarak kaynak özellik ile hedef özellik arasında bir eşleme
     yapılmaktadır. Yani burada "id" özelliği Auth nesnesindeki özellik, "authid" özelliği ise RegisterResponseDto
     nesnesindeki özellik olarak belirlenmiştir.*/




}

