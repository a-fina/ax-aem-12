package ax.test.archetype.core.servlets.configuration;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(
        name = "Simple POST Servlet - Configuration",
        description = "Simple POST Servlet - Configuration"
)
public @interface ConfigurationNewPostServlet {

    @AttributeDefinition(
            name = "Catalog Path",
            description = "Path catalogo dei prodotti Vintage",
            type = AttributeType.STRING
    )
    String catalogPath() default "/etc/commerce/products/ax-test-12/";

    @AttributeDefinition(
            name = "DAM Path",
            description = "Path DAM ax-test",
            type = AttributeType.STRING
    )
    String damPath() default "/content/dam/ax-test-12/";

    @AttributeDefinition(
            name = "Password Repository",
            description = "Password di admin per accesso al repository",
            type = AttributeType.PASSWORD
    )
    String repositoryPassword() default "admin";
}
