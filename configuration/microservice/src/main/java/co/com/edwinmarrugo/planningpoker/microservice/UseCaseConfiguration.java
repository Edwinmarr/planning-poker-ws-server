package co.com.edwinmarrugo.planningpoker.microservice;

import co.com.edwinmarrugo.planningpoker.domain.usecase.CreateRoomUseCase;
import co.com.edwinmarrugo.planningpoker.domain.usecase.ports.GameRoomSessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Registro de los Casos de uso de la aplicacion.
 *
 * Los casos de uso son la parte de la arquitectura limpia donde se define la logica de negocio.
 *
 * Los casos de uso deben estar en el modulo domain/usecase
 *
 */
@Configuration
@RequiredArgsConstructor
public class UseCaseConfiguration {
    private final GameRoomSessionRepository gameRoomSessionRepository;
    @Bean
    public CreateRoomUseCase createRoomUseCase() {
        return new CreateRoomUseCase(gameRoomSessionRepository);
    }

}
