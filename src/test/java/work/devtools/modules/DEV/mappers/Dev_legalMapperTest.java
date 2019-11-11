package work.devtools.modules.DEV.mappers;

import org.junit.Test;
import work.devtools.modules.DEV.pojo.dto.Dev_company;
import work.devtools.modules.DEV.pojo.dto.Dev_legal;
import work.devtools.modules.DEV.pojo.po.T_company;

import static org.junit.Assert.assertEquals;

/**
 * Created by 20190301 on 2019/3/28.
 */
public class Dev_legalMapperTest {


    @Test
    public void po2DtoTest() {
        //given
        Dev_legal dev_legal = new Dev_legal();

        //when
//        T_legal t_legal = Dev_legalMapper.INSTANCE.legalDtoToLegal(dev_legal);
//        System.out.print(t_legal);

        //then
//        assertThat(t_legal).isNotNull();
//        assertThat( carDto.getMake() ).isEqualTo( "Morris" );
//        assertThat( carDto.getSeatCount() ).isEqualTo( 5 );
//        assertThat( carDto.getType() ).isEqualTo( "SEDAN" );
    }


    @Test
    public void dto2PoTest(){
        Dev_company devCompany = new Dev_company();
        devCompany.setLegal02("柳传志");
        devCompany.setCompany01("001");
        devCompany.setCompany02("公司编号");
        devCompany.setCompany09("faren001");

        T_company t_company = Dev_companyMapper.INSTANCE.dev_companyToT_company(devCompany);

        assertEquals(devCompany.getCompany01(),t_company.getCompany01());

    }

}