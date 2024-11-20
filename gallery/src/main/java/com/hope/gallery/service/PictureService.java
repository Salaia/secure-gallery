package com.hope.gallery.service;

import com.hope.gallery.enums.SortState;
import com.hope.gallery.model.PictureMeta;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
import java.util.List;

public interface PictureService {
    String uploadPictures(Long ownerId, List<MultipartFile> files) throws Exception;

    ResponseEntity<byte[]> downloadPictures(Long ownerId, String filename) throws Exception;

    List<PictureMeta> getPicturesListForOwner(Long ownerId, LocalDateTime dateFrom, LocalDateTime dateTo, Long sizeFrom, Long sizeTo,
                                              Long picIdFrom, Long picIdTo, SortState sortState);

    List<PictureMeta> getPicturesListForModerator(LocalDateTime dateFrom, LocalDateTime dateTo, Long sizeFrom, Long sizeTo,
                                                  Long picIdFrom, Long picIdTo, SortState sortState);

}
