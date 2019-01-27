package kr.co.episode.api.repository;

import kr.co.episode.api.entity.Member;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

/*
/{repository}/{id}/{property},methods=GET
/{repository}/{id}/{property}/{propertyId},methods=GET
/{repository}/{id}/{property},methods=DELETE
/{repository}/{id}/{property},methods=GET
/{repository}/{id}/{property},methods=PATCH || PUT || POST
/{repository}/{id}/{property}/{propertyId},methods=DELETE
/{repository},methods=OPTIONS
/{repository},methods=HEAD
/{repository},methods=GET
/{repository},methods=GET
/{repository},methods=POST
/{repository}/{id},methods=OPTIONS
/{repository}/{id},methods=HEAD
/{repository}/{id},methods=GET
/{repository}/{id},methods=PUT
/{repository}/{id},methods=PATCH
/{repository}/{id},methods=DELETE
/{repository}/search,methods=HEAD
/{repository}/search,methods=GET
/{repository}/search,methods=OPTIONS
/{repository}/search/{search},methods=GET
/{repository}/search/{search},methods=GET
/{repository}/search/{search},methods=OPTIONS
/{repository}/search/{search},methods=HEAD
*/
@RepositoryRestResource(collectionResourceRel = "members", path = "members")
public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {
    // Prevents DELETE
    @Override
    @RestResource(exported = false)
    void deleteById(Long aLong);

    @Override
    @RestResource(exported = false)
    void delete(Member entity);

    @Override
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends Member> entities);

    @Override
    @RestResource(exported = false)
    void deleteAll();
}
