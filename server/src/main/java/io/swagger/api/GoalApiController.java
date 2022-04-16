package io.swagger.api;

import io.swagger.model.GoalModel;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-16T11:31:32.847Z[GMT]")
@RestController
public class GoalApiController implements GoalApi {

    private static final Logger log = LoggerFactory.getLogger(GoalApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public GoalApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addGoal(@Parameter(in = ParameterIn.DEFAULT, description = "Pet object that needs to be added to the store", required=true, schema=@Schema()) @Valid @RequestBody GoalModel body) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteGoal(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GoalModel> goalGet(@Parameter(in = ParameterIn.QUERY, description = "page number for pagination" ,schema=@Schema()) @Valid @RequestParam(value = "page", required = false) Long page,@Parameter(in = ParameterIn.QUERY, description = "number of records for pagination" ,schema=@Schema()) @Valid @RequestParam(value = "size", required = false) Long size) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GoalModel>(objectMapper.readValue("{\n  \"lastModifiedDateTime\" : \"lastModifiedDateTime\",\n  \"dueDateTime\" : \"dueDateTime\",\n  \"goalName\" : \"goalName\",\n  \"description\" : \"description\",\n  \"createdDateTime\" : \"createdDateTime\",\n  \"id\" : \"id\"\n}", GoalModel.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GoalModel>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GoalModel>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GoalModel> goalIdGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GoalModel>(objectMapper.readValue("{\n  \"lastModifiedDateTime\" : \"lastModifiedDateTime\",\n  \"dueDateTime\" : \"dueDateTime\",\n  \"goalName\" : \"goalName\",\n  \"description\" : \"description\",\n  \"createdDateTime\" : \"createdDateTime\",\n  \"id\" : \"id\"\n}", GoalModel.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GoalModel>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GoalModel>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<GoalModel> updateGoal(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "Goal object that needs to be updated", required=true, schema=@Schema()) @Valid @RequestBody GoalModel body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<GoalModel>(objectMapper.readValue("{\n  \"lastModifiedDateTime\" : \"lastModifiedDateTime\",\n  \"dueDateTime\" : \"dueDateTime\",\n  \"goalName\" : \"goalName\",\n  \"description\" : \"description\",\n  \"createdDateTime\" : \"createdDateTime\",\n  \"id\" : \"id\"\n}", GoalModel.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<GoalModel>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<GoalModel>(HttpStatus.NOT_IMPLEMENTED);
    }

}
