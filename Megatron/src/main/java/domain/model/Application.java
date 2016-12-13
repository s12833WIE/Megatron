package domain.model;

import java.sql.Date;

public class Application implements IHaveId{

	private Integer id;
	private String price;
	private Date date;
	private Integer serviceId;
	private Integer hardwareId;
	private Integer customerId;
	private Integer employeeId;
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public Integer getServiceId() {
		return serviceId;
	}
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	public Integer getHardwareId() {
		return hardwareId;
	}
	public void setHardwareId(Integer hardwareId) {
		this.hardwareId = hardwareId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return price;
	}
	public void setName(String price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
