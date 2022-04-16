/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.33).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.GoalModel;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-04-16T11:31:32.847Z[GMT]")
@Validated
public interface GoalApi {

    @Operation(summary = "Add a new Goal", description = "", tags={ "goal" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "405", description = "Invalid input") })
    @RequestMapping(value = "/goal/",
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<Void> addGoal(@Parameter(in = ParameterIn.DEFAULT, description = "Pet object that needs to be added to the store", required=true, schema=@Schema()) @Valid @RequestBody GoalModel body);


    @Operation(summary = "Delete goal object by Goal ID", description = "", tags={ "goal" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Goal object deleted"),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error") })
    @RequestMapping(value = "/goal/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteGoal(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "Get All Goals", description = "Get all goals with pagination page and size parameter", tags={ "goal" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successfull operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GoalModel.class))),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error") })
    @RequestMapping(value = "/goal/",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<GoalModel> goalGet(@Parameter(in = ParameterIn.QUERY, description = "page number for pagination" ,schema=@Schema()) @Valid @RequestParam(value = "page", required = false) Long page, @Parameter(in = ParameterIn.QUERY, description = "number of records for pagination" ,schema=@Schema()) @Valid @RequestParam(value = "size", required = false) Long size);


    @Operation(summary = "Get goal object by goal ID", description = "", tags={ "goal" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Goal object created", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GoalModel.class))),
        
        @ApiResponse(responseCode = "404", description = "Goal object with given ID not found"),
        
        @ApiResponse(responseCode = "500", description = "Internal Server Error") })
    @RequestMapping(value = "/goal/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<GoalModel> goalIdGet(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") String id);


    @Operation(summary = "Update a goal object by goal ID", description = "", tags={ "goal" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "goal object updated", content = @Content(mediaType = "application/json", schema = @Schema(implementation = GoalModel.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid ID supplied"),
        
        @ApiResponse(responseCode = "404", description = "Goal not found"),
        
        @ApiResponse(responseCode = "405", description = "Validation exception") })
    @RequestMapping(value = "/goal/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<GoalModel> updateGoal(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") String id, @Parameter(in = ParameterIn.DEFAULT, description = "Goal object that needs to be updated", required=true, schema=@Schema()) @Valid @RequestBody GoalModel body);

}
