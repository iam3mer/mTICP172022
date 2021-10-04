import { fireEvent, getByText } from '@testing-library/dom'
import '@testing-library/jest-dom/extend-expect'
import { JSDOM } from 'jsdom'
import fs from 'fs'
import path from 'path'

const html = fs.readFileSync(path.resolve(__dirname, './index.html'), 'utf8');

let dom
let container

describe('index.html', () => {
  beforeEach(() => {
    // Constructing a new JSDOM with this option is the key
    // to getting the code in the script tag to execute.
    // This is indeed dangerous and should only be done with trusted content.
    // https://github.com/jsdom/jsdom#executing-scripts
    dom = new JSDOM(html, { runScripts: 'dangerously' })
    container = dom.window.document.body
  })

  it('renders just one h1 element', () => {
    expect(container.querySelectorAll('h1').length).toBe(1)
  })

  it('check the main tag', () => {
    expect(container.querySelector('main').parentElement.tagName).toBe("BODY")
  })

  it('renders a header element', () => {
    expect(container.querySelector('header')).not.toBeNull()
  })

  it('renders a nav element', () => {
    expect(container.querySelector('nav')).not.toBeNull()
  })

  it('renders a h1 element inside the header tag', () => {
    expect(container.querySelector('header').contains(container.querySelector('h1'))).toBeTruthy()
  })

  it('renders a nav element inside the header tag', () => {
    expect(container.querySelector('header').contains(container.querySelector('nav'))).toBeTruthy()
  })

  it('renders a footer element', () => {
    expect(container.querySelector('footer')).not.toBeNull()
  })

  it('check a footer element class', () => {
    expect(container.querySelector('footer').className).toBe('footer-section')
  })

  it('check the news section tag and id', () => {
    expect(container.querySelector('#news').tagName).toBe("SECTION")
  })

  it('check the team section tag and id', () => {
    expect(container.querySelector('#team').tagName).toBe("SECTION")
  })

  it('check the services section tag and id', () => {
    expect(container.querySelector('#services').tagName).toBe("SECTION")
  })

  it('check a news section class', () => {
    expect(container.querySelector('#news').className).toBe('news-section')
  })

  it('check a team section class', () => {
    expect(container.querySelector('#team').className).toBe('team-section')
  })

  it('check a services section class', () => {
    expect(container.querySelector('#services').className).toBe('services-section')
  })

})