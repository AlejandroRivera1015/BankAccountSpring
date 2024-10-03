package com.Bank.Application.Repositories.UsersRepository;

import java.util.List;
import java.util.function.Function;

import org.hibernate.grammars.hql.HqlParser.DateContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;
import org.springframework.cache.support.NullValue;
import org.springframework.data.domain.Example;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

import com.Bank.Application.Entities.Account;
import com.Bank.Application.Entities.User;
import java.util.Date;

@Repository
public interface UsersRepository extends JpaRepository<User,Integer> {








}
