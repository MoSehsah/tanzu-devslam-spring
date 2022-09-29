package com.vmware.tanzu.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private final DemoProperties props;

    public DemoController(DemoProperties props) {
        this.props = props;
    }

    @RequestMapping("/")
    public String index() {
        return props.message();
    }
}
