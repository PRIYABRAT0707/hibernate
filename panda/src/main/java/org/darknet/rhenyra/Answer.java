package org.darknet.rhenyra;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Answer {
	@Id
	@Column(name="Answer_Id")
	private int aid;
	@Column(name="ANSWER")
	private String ans;
	
    @ManyToOne
	private QuestionPrac QuestionPrac;

	public QuestionPrac getQuestionPrac() {
		return QuestionPrac;
	}
	public void setQuestionPrac(QuestionPrac questionPrac) {
		QuestionPrac = questionPrac;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	

}
