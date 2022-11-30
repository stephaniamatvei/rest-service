package md.utm.restservice.model;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import md.utm.restservice.controller.EmployeeController;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

// class for simplifying link creation in my app
@Component
public class EmployeeModelAssembler implements RepresentationModelAssembler<Employee, EntityModel<Employee>> {

    // converts a non-model object (Employee) into a model-based object (EntityModel<Employee>)
    @Override
    public EntityModel<Employee> toModel(Employee employee) {
        return EntityModel.of(employee,
                /* asks that Spring HATEOAS build a link to the EmployeeController's getOneEmployee() method,
                   and flag it as a self link */
                linkTo(methodOn(EmployeeController.class).getOneEmployee(employee.getId())).withSelfRel(),
                // asks Spring HATEOAS to build a link to the aggregate root, getAllEmployees(), and call it "employees"
                linkTo(methodOn(EmployeeController.class).getAllEmployees()).withRel("employees"));
    }

}
