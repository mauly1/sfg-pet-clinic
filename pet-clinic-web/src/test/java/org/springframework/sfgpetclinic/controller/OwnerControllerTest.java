package org.springframework.sfgpetclinic.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.sfgpetclinic.model.Owner;
import org.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.Matchers.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerControllerTest {
    @Mock
    OwnerService ownerService;
    @InjectMocks
    OwnerController ownerController;
    Set<Owner> ownerSet;
    MockMvc mockMvc;


    @BeforeEach
    void setUp() {

        final Long ownerId1 = 1L;
        final String lastName1 = "Maurya-1";
        final String firstName1 = "Sunil-1";
        Owner owner1 = new Owner();
        owner1.setId(ownerId1);
        owner1.setLastName(lastName1);
        owner1.setFirstName(firstName1);

        final Long ownerId2 = 2L;
        final String lastName2 = "Maurya-2";
        final String firstName2 = "Sunil-2";
        Owner owner2 = new Owner();
        owner2.setId(ownerId2);
        owner2.setLastName(lastName2);
        owner2.setFirstName(firstName2);

        ownerSet = new HashSet<>();
        ownerSet.add(owner1);
        ownerSet.add(owner2);

        mockMvc = MockMvcBuilders
                .standaloneSetup(ownerController)
                .build();
    }

    @Test
    void listOwnersByIndex() throws Exception {
        when(ownerService.findAll()).thenReturn(ownerSet);
        mockMvc.perform(get("/owners/index"))
                .andExpect(status().isOk())
                .andExpect(view().name("owners/index"))
                .andExpect(model().attribute("owners",hasSize(2)));
    }

    @Test
    void listOwnersByEmpty() throws Exception {
        when(ownerService.findAll()).thenReturn(ownerSet);
        mockMvc.perform(get("/owners/index"))
                .andExpect(status().isOk())
                .andExpect(view().name("owners/index"))
                .andExpect(model().attribute("owners",hasSize(2)));
    }
    @Test
    void findOwners() throws Exception {
        mockMvc.perform(get("/owners/find"))
                .andExpect(status().isOk())
                .andExpect(view().name("NotImplemented"));
                //.andExpect(model().attribute("find",isNull()));
        verifyNoInteractions(ownerService);
    }
}