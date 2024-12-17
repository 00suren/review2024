package com.example.demo.framework.springboot.response;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fanyangyang
 */
@RestController
@RequestMapping("/response")
public class ResponseController {

    @RequestMapping("/success")
    public ResponseResult<String> success()
    {
        return ResponseResult.success("success");
    }
}
