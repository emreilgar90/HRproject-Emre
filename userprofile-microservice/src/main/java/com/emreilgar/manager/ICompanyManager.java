package com.emreilgar.manager;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "company-manager"
        ,url = "${myapplication.company.feignurl}"
        ,decode404 = true)
public interface ICompanyManager {
}
