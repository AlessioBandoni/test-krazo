package it.test.eventlog.event.forms;


import javax.enterprise.context.RequestScoped;
import javax.mvc.binding.MvcBinding;
import javax.validation.constraints.Max;
import javax.ws.rs.FormParam;

@RequestScoped
public class DefineEventForm  {

    @FormParam("date")
    @MvcBinding
    private String date;

    @FormParam("type")
    @MvcBinding
    private String type;

    @FormParam("category")
    @MvcBinding
    private String category;

    @FormParam("tags")
    @MvcBinding
    private String tags;

    @FormParam("text")
    @Max(10)
    @MvcBinding
    private Integer text;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }

    public String getTags() {
        return tags;
    }

    public Integer getText() {
        return text;
    }

    public void setText(Integer text) {
        this.text = text;
    }
}
