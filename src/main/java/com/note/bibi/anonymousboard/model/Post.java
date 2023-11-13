package com.note.bibi.anonymousboard.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
public class Post extends BaseEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "title", nullable = false)
  private String title;
  @Column(name = "content", nullable = false)
  private String content;

  @Builder
  public Post(String title, String content) {
    this.title = title;
    this.content = content;
  }
}
