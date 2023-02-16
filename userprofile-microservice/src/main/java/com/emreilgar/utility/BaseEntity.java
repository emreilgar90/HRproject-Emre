package com.emreilgar.utility;

import com.emreilgar.repository.entity.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
public class BaseEntity {
    Long createdate;
    Long updatedate;
    Status isactive;
}
