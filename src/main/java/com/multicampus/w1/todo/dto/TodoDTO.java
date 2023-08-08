package com.multicampus.w1.todo.dto;

import java.time.LocalDate;

public class TodoDTO {
       private Long tno;
       private String title;
       private LocalDate dueDate;
       private boolean finished;

    //getter setter 단축키 : alt+insert 키

    public Long getTno() {
        return tno;
    }

    public void setTno(Long tno) {
        this.tno = tno;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    //Overrindg 단축키 : ctrl + O

    @Override
    public String toString() {

        return "TodoDTO{"
                +"tno = "+ tno
                +", title ='"+ title+'\''
                +", dueDate=" +dueDate
                +", finished=" + finished + '}';


    }
}
