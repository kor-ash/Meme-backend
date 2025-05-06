package backend.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "meme_tags")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@IdClass(MemeTagId.class)
public class MemeTag {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "meme_id")
    private Meme meme;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tag_id")
    private Tag tag;

    @Builder
    public MemeTag(Meme meme, Tag tag) {
        this.meme = meme;
        this.tag = tag;
    }
}