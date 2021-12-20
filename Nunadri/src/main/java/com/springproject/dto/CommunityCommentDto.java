package com.springproject.dto;

import lombok.Data;

@Data
public class CommunityCommentDto {
	private String nickname;
	private String id;
	private String profile;
	private int communityCommentNo;
	private String communityComment;
	private String noticeCategory;
	private int noticeNo;
}