package backend.domain;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "sources")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Source {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String platform; // instagram, reddit 등

    @Column(name = "origin_url", columnDefinition = "TEXT")
    private String originUrl;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    @Builder
    public Source(String platform, String originUrl) {
        this.platform = platform;
        this.originUrl = originUrl;
    }
}