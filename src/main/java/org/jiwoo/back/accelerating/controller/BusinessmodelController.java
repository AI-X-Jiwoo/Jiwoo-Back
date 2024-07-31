package org.jiwoo.back.accelerating.controller;

import org.jiwoo.back.accelerating.aggregate.vo.ResponsePythonServerVO;
import org.jiwoo.back.accelerating.service.BusinessmodelService;
import org.jiwoo.back.business.dto.BusinessDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/business-model")
public class BusinessmodelController {

    private final BusinessmodelService businessmodelService;

    @Autowired
    public BusinessmodelController(BusinessmodelService businessmodelService) {
        this.businessmodelService = businessmodelService;
    }

    /* 설명. 유사 서비스 조회 */
    @PostMapping("/similar-services")
    public ResponseEntity<List<ResponsePythonServerVO>> getSimilarServices(@RequestBody BusinessDTO businessDTO) {
        return businessmodelService.getSimilarServices(businessDTO);
    }
}