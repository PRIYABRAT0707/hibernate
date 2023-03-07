package org.darknet.rhenyra;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class QuestionPrac {
	@Id
	@Column(name="question_id")
	private int qid;
	@Column(name="QUESTION")
	private String quest;
	
	@OneToMany(mappedBy="QuestionPrac")
	private List<Answer> ans;

	@Override
	public String toString() {
		return "QuestionPrac [qid=" + qid + ", quest=" + quest + ", ans=" + ans + "]";
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

	public List<Answer> getAns() {
		return ans;
	}

	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}


}
