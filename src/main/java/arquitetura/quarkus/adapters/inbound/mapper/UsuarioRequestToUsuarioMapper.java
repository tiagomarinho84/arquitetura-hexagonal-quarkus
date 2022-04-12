package arquitetura.quarkus.adapters.inbound.mapper;

import arquitetura.quarkus.adapters.inbound.request.UsuarioRequest;
import arquitetura.quarkus.application.core.domain.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface UsuarioRequestToUsuarioMapper {

    Usuario mapper(UsuarioRequest usuarioRequest);
}
