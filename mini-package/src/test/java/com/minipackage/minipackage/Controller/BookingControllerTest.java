package com.minipackage.minipackage.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.minipackage.minipackage.Dto.PackageInformation;
import com.minipackage.minipackage.Entity.Packages;
import com.minipackage.minipackage.Service.BookingService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(BookingController.class)
@ActiveProfiles(value = "Test")
public class BookingControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private BookingService bookingService;

    @Test
    void should_return_ok_when_create_package() throws Exception {
        PackageInformation packagesInfo = new PackageInformation();
        when(bookingService.add(packagesInfo)).thenReturn(packagesInfo);

        ResultActions result = mvc.perform(post("/bookings")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(packagesInfo)));
        result.andExpect(status().isCreated());
    }
}