package dev.pinter.apidemo;


import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;

@ApplicationPath("/")
@OpenAPIDefinition(
        info = @Info(
                title = "Demo API Microprofile",
                version = "0.1"
        ),
        servers = {@Server(url = "/", description = "localhost")}
)
public class ApiApplication extends Application {
}
