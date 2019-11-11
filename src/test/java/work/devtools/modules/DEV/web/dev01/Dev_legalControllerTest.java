package work.devtools.modules.DEV.web.dev01;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import work.devtools.modules.DEV.pojo.dto.Dev_legal;
import work.devtools.modules.DEV.service.Dev_legalService;


import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



/**
 * Created by 20190301 on 2019/3/28.
 */
@RunWith(SpringRunner.class)
@WebMvcTest
//@SpringBootTest
public class Dev_legalControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private Dev_legalService dev_legalService;

    @Test
    public void getListTest() throws Exception {
        //模拟service
//        Dev_legal dto = new Dev_legal();
//        dto.setLegal01("001");
//        dto.setLegal02("驭邦1");
//        PageRequest pageRequest =  new PageRequest(0,3);
//        given(this.dev_legalService.query(dto,pageRequest).getTotalPages()).willReturn(2);
//        //mvc 调用
//        int page = 0;
//        int size = 3;
//        RequestBuilder request = null;
//        request = get("/legal/list/{dev_legal.legal01}",001);
//
//        mvc.perform(request)
//                .andExpect((ResultMatcher) content().string(equalTo(String.valueOf(""))));


    }


}