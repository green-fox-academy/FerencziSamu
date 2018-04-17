package com.greenfox.jason_not_fun.Controllers;

import com.greenfox.jason_not_fun.JasonNotFunApplication;
import com.greenfox.jason_not_fun.untilService.UntilService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.nio.charset.Charset;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = JasonNotFunApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class SzamRestControllerTest {
  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      Charset.forName("utf8"));

  @Test
  public void contextLoads() throws Exception {
  }

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void isDoublingOkayTest() throws Exception {
    mockMvc
        .perform(get("/doubling?input=5")
            .contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.result").value(10));
  }

  @Test
  public void greeterTest() throws Exception {
    mockMvc.perform(get("/greeter")
        .param("name", "Petike")
        .param("title", "student"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.welcome_message")
            .value("Oh, hi there Petike, my dear student!"));
  }

  @Test
  public void appendTest() throws Exception {
    mockMvc.perform(get("/appenda/{appendable}", "kuty"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.appended").value("kutya"));
  }

  @Test
  public void doUntilSumTest() throws Exception {
    mockMvc.perform(post("/dountil/{what}", "sum")
        .contentType(MediaType.APPLICATION_JSON)
        .content("{\"until\" : \"6\"}"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.result").value(21));
  }

  @Test
  public void doUntilFactTest() throws Exception {
    mockMvc.perform(post("/dountil/{what}", "factor")
        .contentType(MediaType.APPLICATION_JSON)
        .content("{\"until\" : \"5\"}"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.result").value(120));

  }

  @Test
  public void doUntilSumNoNumber()throws Exception{
    mockMvc.perform(post("/dountil/{what}", "sum")
        .contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.error").value("Please provide a number!"));
  }

  @Test
  public void doUntilFactNoNumber()throws Exception{
    mockMvc.perform(post("/dountil/{what}", "factor")
        .contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.error").value("Please provide a number!"));
  }

}
