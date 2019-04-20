package todoList;

public class Task {
	private String description, dueDate, status;
	private int priority;
	
	/*constructor */
	public Task(String description, int priority, String dueDate)
	{
		this.description = description;
		this.priority = priority;
		this.dueDate = dueDate;
		status = "not started";
	}
	
	/*mutators */
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setPriority(int priority) {
		this.priority = priority;
	}
	
	public void setdueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	/* accessors */
	public String getDescription() {
		return description;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public String getdueDate() {
		return dueDate;
	}
	
	public String getStatus() {
		return status;
	}
}
