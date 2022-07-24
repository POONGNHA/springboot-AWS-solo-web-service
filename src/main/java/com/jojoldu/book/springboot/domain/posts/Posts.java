package com.jojoldu.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;    // 테이블과 링크
import javax.persistence.GeneratedValue;    //PK의 생성규칙
import javax.persistence.GenerationType;
import javax.persistence.Id;    // 해당 테이블의 PK필드를 표시

// lombok 어노테이션은 코드를 단순화 시키지만 필수는 아니므로 클래스에서 비교적 멀리 떨어뜨려 놓는다.
@Getter
@NoArgsConstructor  // 기본 생성자 자동추가
@Entity // JAP의 어노테이션. Setter 메소드를  만들지 않는다
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
