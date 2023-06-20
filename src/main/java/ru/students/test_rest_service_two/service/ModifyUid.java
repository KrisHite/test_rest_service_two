package ru.students.test_rest_service_two.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.students.test_rest_service_two.model.Response;
@Service
@Qualifier("ModifyUid")
public class ModifyUid implements ru.students.test_rest_service_two.service.MyModifyService {
    @Override
    public Response modify(Response response) {
        response.setUid("New Uid");
        return response;
    }
}
