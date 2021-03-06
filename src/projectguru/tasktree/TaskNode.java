/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectguru.tasktree;

import java.util.List;
import projectguru.entities.Task;

/**
 *
 * @author marko
 */
public class TaskNode {
    protected Task task;

    public TaskNode(Task task) {
        this.task = task;
    }
    protected List<TaskNode> children;

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public List<TaskNode> getChildren() {
        return children;
    }

    public void setChildren(List<TaskNode> children) {
        this.children = children;
    }
    
    public void addChild(TaskNode node){
        children.add(node);
    }
    
    
}
