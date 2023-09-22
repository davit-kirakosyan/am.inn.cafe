package am.inn.cafe.wrapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserWrapper {

    private Integer id;

    private String name;

    private String email;

    private String contactNumber;

    private String status;

}
