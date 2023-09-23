package am.inn.cafe.restImpl;

import am.inn.cafe.JWT.JwtFilter;
import am.inn.cafe.constents.CafeConstants;
import am.inn.cafe.rest.BillRest;
import am.inn.cafe.service.BillService;
import am.inn.cafe.utilis.CafeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class BillRestImpl implements BillRest {

    @Autowired
    BillService billService;

    @Autowired
    JwtFilter jwtFilter;

    @Override
    public ResponseEntity<String> generateReport(Map<String, Object> requestMap) {
        try {
            return billService.generateReport(requestMap);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return CafeUtils.getResponseEntity(CafeConstants.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
