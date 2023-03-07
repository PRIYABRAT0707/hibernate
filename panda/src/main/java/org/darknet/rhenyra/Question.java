package org.darknet.rhenyra;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Question {
	@Id
	@Column(name="question_id")
	private int qid;
	@Column(name="QUESTION")
	private String quest;
	
	@OneToOne
	private Answer answer;
	
	

	@Override
	public String toString() {
		return "Question [qid=" + qid + ", quest=" + quest + ", answer=" + answer + "]";
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQuest() {
		return quest;
	}

	public void setQuest(String quest) {
		this.quest = quest;
	}

	

}
