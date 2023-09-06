package kg.neo.eShopSecurity.demoController;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/demo-controller")
@RequiredArgsConstructor

public class DemoController {

    @GetMapping
    public ResponseEntity<String > seyHello(){
        return ResponseEntity.ok("Hello from security-secret endpoint");
    }
}
