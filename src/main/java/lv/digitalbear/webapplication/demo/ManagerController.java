package lv.digitalbear.webapplication.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/management")
public class ManagerController {

    @GetMapping
    public String get() {
        return "GET :: Manager Contact page";
    }

    @PostMapping
    public String post() {
        return "POST :: Manager Contact page";
    }

    @PutMapping
    public String put() {
        return "PUT :: Manager Contact page";
    }

    @DeleteMapping
    public String delete() {
        return "DELETE :: Manager Contact page";
    }
}

