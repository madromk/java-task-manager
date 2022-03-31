package tasks;

import manager.Statuses;
import manager.TypeOfTask;

public class BaseTask {
    private String name;
    private String description;
    private int id;
    Statuses status;
    TypeOfTask type;

    public BaseTask(String name, String description, Statuses status) {
        this.name = name;
        this.description = description;
        this.status = status;
    }

    public BaseTask(String name, String description, Statuses status, TypeOfTask type) {
        this.name = name;
        this.description = description;
        this.status = status;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Statuses getStatus() {
        return status;
    }

    public void setId(int baseId) {
        this.id = baseId;
    }

    public void setStatus(Statuses status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }


    public TypeOfTask getType() {
        return type;
    }

    @Override
    public String toString() {
        return getId() + ", " + getType() + ", " + getName() + ", "
                + getStatus() + ", " + getDescription() + ", ";
    }


    public void setType(TypeOfTask type) {
        this.type = type;
    }
}
