package com.hyundai.seller.taxBill.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.hyundai.seller.taxBill.service.TaxBillStatusVO;

import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

/**
 * TaxBill에 관한 데이터처리 매퍼 클래스
 *
 * @author  CDF Team
 * @since 2018.12.1
 * @version 1.0
 * @see <pre>
 *  == 개정이력(Modification Information) ==
 *
 *   수정일              수정자          수정내용
 *  ----------------    ------------    ---------------------------
 *   2018.12.1          CDF Team        최초 생성
 *
 * </pre>
 */

@Repository("sellerTaxBillMapper")
public class TaxBillMapper extends EgovAbstractMapper {

	/**
	 * 대리점 세금계산서 목록을 조회한다.
	 * @param params
	 * @return 대리점 세금계산서 목록
	 * @exception Exception
	 */
	public List<TaxBillStatusVO> selectSellerTaxBillList(Map<String, Object> params) throws Exception {
		return selectList("selectSellerTaxBillList", params);
	}

	public List<TaxBillStatusVO> selectSellerTaxBillStatusList(Map<String, Object> params) throws Exception {
		return selectList("selectSellerTaxBillStatusList", params);
	}

	public int selectSellerTaxBillStatusListCnt(Map<String, Object> params) throws Exception {
		return selectOne("selectSellerTaxBillStatusListCnt", params);
	}

	public long selectSellerTaxBillStatusListSum(Map<String, Object> params) throws Exception {
		return selectOne("selectSellerTaxBillStatusListSum", params);
	}

}