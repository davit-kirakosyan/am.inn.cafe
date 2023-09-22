package am.inn.cafe.wrapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductWrapper {

   private Integer id;

   private String name;

   private String description;

   private Integer price;

   private String status;

   private Integer categoryId;

   private String categoryName;

}
