package com.dhy.yycompany.lock.service.ApartmentService;

public interface ApartmentService {
    /**
     * 删除公寓楼，同时需要删除公寓中的所有房间，如果房间有人，则无法删除公寓楼
     * @param apartmentID
     * @return
     */
    int deleteApartment(int apartmentID);
}
