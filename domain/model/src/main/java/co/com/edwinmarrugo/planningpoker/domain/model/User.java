package co.com.edwinmarrugo.planningpoker.domain.model;

import co.com.edwinmarrugo.planningpoker.domain.model.enums.UserRole;
import co.com.edwinmarrugo.planningpoker.domain.model.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class User {
    private String id;
    private String name;
    private UserRole userRole;
    private UserType userType;
}
