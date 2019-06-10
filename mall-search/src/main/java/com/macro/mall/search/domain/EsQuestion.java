package com.macro.mall.search.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/**
 * 题库中题目详情模型
 * 
 * @author guob
 *
 */
@Document(indexName = "edu", type = "question", shards = 1, replicas = 0)
public class EsQuestion implements Serializable {
	private static final long serialVersionUID = 7364777746817545924L;
	/**
	 * 题目ID
	 */
	@Id
	private int id;
	/**
	 * 知识点ID
	 */
	@Field(type = FieldType.Keyword)
	private int knowledgeId;
	/**
	 * 题目标题
	 */
	@Field(analyzer = "ik_max_word", type = FieldType.Text)
	private String title;
	/**
	 * 题目选项A
	 */
	private String option_a;
	/**
	 * 题目选项B
	 */
	private String option_b;
	/**
	 * 题目选项C
	 */
	private String option_c;
	/**
	 * 题目选项D
	 */
	private String option_d;
	/**
	 * 题目选项E
	 */
	private String option_e;
	/**
	 * 最终答案
	 */
	private String answer1;
	/**
	 * 答案的解答思路
	 */
	private String answer2;
	/**
	 * 答案的解答思路的详细分析
	 */
	private String parse;
	/**
	 * 题目类型1. 选择题，2. 填空题，3. 判断题，4. 计算题，5. 解答题，6. 作图题，7. 综合题
	 */
	@Field(type = FieldType.Keyword)
	private int qtype;
	/**
	 * 题目难度系数，题目的正确率来表示难度，难度值越低，表示越少的学生正确，题目越难
	 */
	private float diff;
	/**
	 * 题目的考点
	 */
	private String knowledges;
	/**
	 * 试卷类型 1 → 同步练习、月考，2 → 模拟考试、期中、期末考试，3 → 中考，4 → 高考，5 → 会考、学业考试，6 → 其他
	 */
	private String paperType;
	/**
	 * 题目所属年级
	 */
	private int gradeId;
	/**
	 * 题目所属科目
	 */
	private int subjectId;
	/**
	 * 题目所属地区，例如江苏，重庆，浙江等
	 */
	private String area;
	/**
	 * 题目创建的年份
	 */
	private int year;
	/**
	 * 题目所属来源，例如“2015-2016学年北京161中七年级（上）期中数学试卷”，“2015-2016学年湖北省宜昌市夷陵区龙泉中学七年级（上）
	 * 期末数学试卷”
	 */
	private String source;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOption_a() {
		return option_a;
	}

	public void setOption_a(String option_a) {
		this.option_a = option_a;
	}

	public String getOption_b() {
		return option_b;
	}

	public void setOption_b(String option_b) {
		this.option_b = option_b;
	}

	public String getOption_c() {
		return option_c;
	}

	public void setOption_c(String option_c) {
		this.option_c = option_c;
	}

	public String getOption_d() {
		return option_d;
	}

	public void setOption_d(String option_d) {
		this.option_d = option_d;
	}

	public String getOption_e() {
		return option_e;
	}

	public void setOption_e(String option_e) {
		this.option_e = option_e;
	}

	public String getAnswer1() {
		return answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public String getAnswer2() {
		return answer2;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
	}

	public String getParse() {
		return parse;
	}

	public void setParse(String parse) {
		this.parse = parse;
	}

	public int getQtype() {
		return qtype;
	}

	public void setQtype(int qtype) {
		this.qtype = qtype;
	}

	public float getDiff() {
		return diff;
	}

	public void setDiff(float diff) {
		this.diff = diff;
	}

	public String getKnowledges() {
		return knowledges;
	}

	public void setKnowledges(String knowledges) {
		this.knowledges = knowledges;
	}

	public String getPaperType() {
		return paperType;
	}

	public void setPaperType(String paperType) {
		this.paperType = paperType;
	}

	public int getGradeId() {
		return gradeId;
	}

	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getKnowledgeId() {
		return knowledgeId;
	}

	public void setKnowledgeId(int knowledgeId) {
		this.knowledgeId = knowledgeId;
	}

}
