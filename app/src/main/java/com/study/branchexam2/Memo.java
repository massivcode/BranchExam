package com.study.branchexam2;

/**
 * Created by massivcode@gmail.com on 2017. 5. 27. 11:52
 */

public class Memo {
    private String title;
    private String contents;

    public Memo(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Memo{");
        sb.append("title='").append(title).append('\'');
        sb.append(", contents='").append(contents).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
