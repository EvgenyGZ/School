package entity;


public class Topic {
    private Long ID;
    private String topicName;
    private String Description;
    private Long time;

    public Topic() {
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Topic{" + "ID=" + ID + ", topicName=" + topicName + ", Description=" + Description + ", time=" + time + '}';
    }
    
    

}

 
