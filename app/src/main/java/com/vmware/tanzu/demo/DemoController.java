package com.vmware.tanzu.demo;

import com.vmware.tanzu.demo.DemoProperties;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

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
