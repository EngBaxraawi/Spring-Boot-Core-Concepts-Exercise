//package DemoApplication.java;
//
//import org.springframework.web.bind.annotation.*;
//import org.springframework.http.*;
//import java.net.URI;
//
//
//@RestController
//public class GreetingController {
//
//    @GetMapping("/")
//    public String welcome() {
//        return "Welcome to Spring Boot! BY Mohamed Daud C1220848";
//    }
//
//    @GetMapping("/greet/{name}")
//    public String greet(@PathVariable String name) {
//        return "Hello, " + name + "!";
//    }
//
//    @GetMapping("/success")
//    public ResponseEntity<String> success() {
//        return ResponseEntity.ok()
//                .header("Custom-Header", "SpringBootApp")
//                .body("Success with custom header");
//    }
//
//    @GetMapping("/not-found")
//    public ResponseEntity<String> notFound() {
//        return ResponseEntity.status(HttpStatus.NOT_FOUND)
//                .body("Error: Resource not found");
//    }
//
//    @PostMapping("/create")
//    public ResponseEntity<String> create() {
//        URI location = URI.create("/resource/C1220848");
//        return ResponseEntity.created(location).body("Resource created");
//    }
//
//}
