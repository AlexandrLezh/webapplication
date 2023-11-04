package lv.digitalbear.webapplication.demo;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {

    @GetMapping
    public String get() {
        return "GET :: admin Contact page";
    }

    @PostMapping
    public String post() {
        return "POST :: admin Contact page";
    }

    @PutMapping
    public String put() {
        return "PUT :: admin Contact page";
    }

    @DeleteMapping
    public String delete() {
        return "DELETE :: admin Contact page";
    }
}
