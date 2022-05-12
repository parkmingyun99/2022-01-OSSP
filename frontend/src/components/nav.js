import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import {Navbar, Nav, NavDropdown} from 'react-bootstrap';
import {useEffect, useState} from 'react';
import {Link} from 'react-router-dom'

const MenuItem = ({active, children, to})=>(

    <Link to={to} className="menu-item">
        {children}
    </Link>
)

function Navigation(){
    return(
        <div className="Navigation">
            <Nav className="p-1 mb-5" variant ="pills" activekey="1">
                <NavDropdown title="가이드 선택" id="guide">
                    <NavDropdown.Item><MenuItem to={'/graduateGuide'}>학업이수 가이드</MenuItem></NavDropdown.Item>
                    <NavDropdown.Item><MenuItem to={'/scheduleGuide'}>시간표 가이드</MenuItem></NavDropdown.Item>
                    <NavDropdown.Item><MenuItem to={'/emptyGuide'}>공강 가이드</MenuItem></NavDropdown.Item>
                </NavDropdown>
                <NavDropdown title="공과대학" id="college">
                    <NavDropdown.Item>학업이수 가이드</NavDropdown.Item>
                    <NavDropdown.Item>스케줄 가이드</NavDropdown.Item>
                    <NavDropdown.Item>공강 가이드</NavDropdown.Item>
                </NavDropdown>
                <NavDropdown title="컴퓨터공학과" id="major">
                    <NavDropdown.Item>컴퓨터공학과</NavDropdown.Item>
                    <NavDropdown.Item>스케줄 가이드</NavDropdown.Item>
                    <NavDropdown.Item>공강 가이드</NavDropdown.Item>
                </NavDropdown>
            </Nav>  
        </div>
    )
}

export default Navigation;