package cl.consulta.web.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cl.consulta.web.model.Status;
import cl.consulta.web.model.Register;
import cl.consulta.web.services.DataServices;

@Controller
@RequestMapping("/user")
public class RestController {

	@Autowired
	DataServices dataServices;

	static final Logger logger = Logger.getLogger(RestController.class);

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Status addUser(@RequestBody Register user) {
		try {
			dataServices.addEntity(user);
			return new Status(1, "User added Successfully !");
		} catch (Exception e) {
			// e.printStackTrace();
			return new Status(0, e.toString());
		}

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public @ResponseBody Register getUser(@PathVariable("id") long id) {
		Register user = null;
		try {
			user = dataServices.getEntityById(id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody List<Register> getUser() {

		List<Register> userList = null;
		try {
			userList = dataServices.getEntityList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return userList;
	}

	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	public @ResponseBody Status deleteUser(@PathVariable("id") long id) {

		try {
			dataServices.deleteEntity(id);
			return new Status(1, "User deleted Successfully !");
		} catch (Exception e) {
			return new Status(0, e.toString());
		}

	}
}
