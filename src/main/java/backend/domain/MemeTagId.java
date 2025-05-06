package backend.domain;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemeTagId implements Serializable {
    private Long meme;
    private Long tag;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MemeTagId that)) return false;
        return Objects.equals(meme, that.meme) && Objects.equals(tag, that.tag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meme, tag);
    }
}