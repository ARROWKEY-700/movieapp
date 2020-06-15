package study.datajpa.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import study.datajpa.entity.Member;

@Data
@AllArgsConstructor
public class MemberDto {

	private Long id;
	private String userName;
	private String teamName;

	public MemberDto(Member member) {
		this.id = member.getId();
		this.userName = member.getUsername();

	}

}
